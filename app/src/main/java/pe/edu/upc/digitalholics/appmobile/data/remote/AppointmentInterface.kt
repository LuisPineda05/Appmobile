package pe.edu.upc.digitalholics.appmobile.data.remote

import pe.edu.upc.digitalholics.appmobile.data.model.Appointment
import pe.edu.upc.digitalholics.appmobile.data.model.Patient
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AppointmentInterface {
    @GET("appointments")
    fun getAllAppointments(): Call<AppointmentResponse>

    @GET("appointments/{index}")
    fun getAppointmentById(@Path("index")index: String): Call<Appointment>
}