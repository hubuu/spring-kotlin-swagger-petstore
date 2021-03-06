package com.example.petstore.api

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File

@RestController
@RequestMapping("/pets")
class PetController {

    @PostMapping("/{petId}/uploadImage")
    fun uploadImage(image: File): ApiResponse = ApiResponse(0, "success", "upload successful")
}
