package com.yahyafati.awsdemo.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import java.sql.Timestamp

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    var name: String = "",
    var email: String = "",
    var username: String = "",
    var password: String = "",
    var profilePicture: String = "",

    @CreationTimestamp
    var createdAt: Timestamp = Timestamp(System.currentTimeMillis()),
)