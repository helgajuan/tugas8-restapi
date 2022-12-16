package api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConfig {
    public static ApiService getApiService() {
        Retrofit retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl("http://192.168.100.13/restapi/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiService.class);
    }
}
