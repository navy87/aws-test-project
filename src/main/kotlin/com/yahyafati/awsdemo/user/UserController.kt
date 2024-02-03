package com.yahyafati.awsdemo.user

import com.yahyafati.awsdemo.user.dto.CreateUserDto
import com.yahyafati.awsdemo.user.dto.UpdateUserDto
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val userService: IUserServices
) {

    @GetMapping("/")
    fun getUsers() : List<User> {
        return userService.getUsers()
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long) : User {
        return userService.getUser(id)
    }

    @PostMapping("/")
    fun createUser(@RequestBody createUserDto: CreateUserDto) : User {
        return userService.createUser(createUserDto)
    }

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: Long, @RequestBody updateUserDto: UpdateUserDto) : User {
        return userService.updateUser(id, updateUserDto)
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long) {
        return userService.deleteUser(id)
    }
}