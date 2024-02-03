package com.yahyafati.awsdemo.user.dto

import com.yahyafati.awsdemo.user.User

data class UpdateUserDto(
    val name: String,
    val email: String,
    val profilePicture: String? = null
) {

    constructor(user: User) : this(
        name = user.name,
        email = user.email,
        profilePicture = user.profilePicture
    )
}
