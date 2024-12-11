package com.example.plugins

import com.example.models.pharmacies.PharmacyManagement
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello Avila Digital!")
        }
        // Static plugin. Try to access `/static/index.html`
        staticResources("/static", "static")

        get("/farmacias/{mes}") {
            val month = call.parameters["mes"]
            val pharmacies = PharmacyManagement().findPharmaciesByMonth(month)
            if (pharmacies.isEmpty()) {
                call.respondText("No se han encontrado farmacias para el mes $month")
            } else {
                call.respond(pharmacies)
            }
        }
    }
}
