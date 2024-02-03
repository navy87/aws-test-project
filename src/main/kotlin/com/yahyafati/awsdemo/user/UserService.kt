package com.yahyafati.awsdemo.user

import com.yahyafati.awsdemo.user.dto.CreateUserDto
import com.yahyafati.awsdemo.user.dto.UpdateUserDto
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) : IUserServices {
    override fun getUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun getUser(id: Long): User {
        return userRepository.findById(id).orElseThrow{
            throw IllegalArgumentException("User with id $id not found")
        }
    }

    override fun createUser(createUserDto: CreateUserDto) : User {
        val user = User(
            name = createUserDto.name,
            email = createUserDto.email,
        )
        return userRepository.save(user)
    }

    override fun updateUser(id: Long, updateUserDto: UpdateUserDto) : User {
        val user = userRepository.findById(id).orElseThrow{
            throw IllegalArgumentException("User with id $id not found")
        }
        user.name = updateUserDto.name
        user.email = updateUserDto.email
        return userRepository.save(user)
    }

    override fun deleteUser(id: Long) {
        userRepository.deleteById(id)
    }
}