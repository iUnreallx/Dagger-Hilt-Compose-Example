package com.unreallx.mvvmtest.data

import com.unreallx.mvvmtest.model.User
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun getUsers(): List<User> {
        return listOf(
            User(1, "John Doe", "john@example.com"),
            User(2, "Jane Smith", "jane@example.com"),
            User(3, "Sam Wilson", "sam@example.com")
        )
    }
}