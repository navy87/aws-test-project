package com.yahyafati.awsdemo.user

import com.yahyafati.awsdemo.user.dto.CreateUserDto
import com.yahyafati.awsdemo.user.dto.UpdateUserDto

interface IUserServices {
    fun getUsers() : List<User>
    fun getUser(id: Long): User
    fun createUser(createUserDto: CreateUserDto) : User
    fun updateUser(id: Long, updateUserDto: UpdateUserDto) : User
    fun deleteUser(id: Long)
}