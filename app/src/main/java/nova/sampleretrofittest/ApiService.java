package nova.sampleretrofittest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface ApiService {
//    public static final String API_URL2 = "http://115.68.231.13/project/android/";

    public static final String API_URL = "http://jsonplaceholder.typicode.com/";

    @GET("comments")
    Call<ResponseBody>getComment(@Query("postId") int postId);

    @POST("comments")
    Call<ResponseBody>getPostComment(@Query("postId") int postId);

    @GET("callAllFeeds.php")
    Call<ResponseBody>getList();


}