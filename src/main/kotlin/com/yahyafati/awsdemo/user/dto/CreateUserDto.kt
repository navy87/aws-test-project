package com.yahyafati.awsdemo.user.dto

import com.yahyafati.awsdemo.user.User

data class CreateUserDto(
    val name: String,
    val email: String
) {

    constructor(user: User) : this(
        name = user.name,
        email = user.email
    )
}
