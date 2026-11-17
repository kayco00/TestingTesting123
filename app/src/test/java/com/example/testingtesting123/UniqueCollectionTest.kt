package com.example.testingtesting123

import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        collection.addItem(Item("one"))
        val item = collection.get(0)
        assert(item.name == "one")
        assert(collection.size() == 1)
    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        collection.addItem(Item("one"))
        collection.addItem(Item("one"))
        collection.addItem(Item("two"))
        assert(collection.size() == 2)
        assert(collection.get(0) != collection.get(1))
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size();

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}