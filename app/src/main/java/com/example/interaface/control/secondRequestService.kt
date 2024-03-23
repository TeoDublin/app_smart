import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface secondRequestService {
    @GET("waterPermissions")
    suspend fun fetchWaterPermissions(@Header("Token") token: String?): Response<Any>
}
