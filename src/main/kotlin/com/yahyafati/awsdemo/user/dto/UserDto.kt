package com.yahyafati.awsdemo.user.dto

import com.yahyafati.awsdemo.user.User

data class UserDto(
    val id: Long = 0,
    val name: String = "",
    val email: String = "",
    val profilePicture: String? = null
) {

    constructor(user: User) : this(
        id = user.id,
        name = user.name,
        email = user.email,
        profilePicture = user.profilePicture
    )
}