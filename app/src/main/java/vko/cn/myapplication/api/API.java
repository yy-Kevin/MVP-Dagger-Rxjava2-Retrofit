package vko.cn.myapplication.api;

import java.util.Map;


import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import vko.cn.myapplication.module.bean.BaseEntity;
import vko.cn.myapplication.module.bean.UserInfo;

/**
 * Created by A on 2017/9/4.
 */

public interface API {

    @FormUrlEncoded
    @POST("/user/login")
    Observable<BaseEntity<UserInfo>> login(
            @Field("name") String userId,
            @Field("pwd") String password
    );

    @GET("/")
    Observable<BaseEntity<UserInfo>> play();

//    @GET("video/getUrl")
//    Observable<BaseEntity<VideoUrl>> getVideoUrl(
//            @Query("id") long id
//    );

    @FormUrlEncoded
    @POST("user/addVideo")
    Observable<BaseEntity<Boolean>> addVideo(
            @FieldMap Map<String, Object> map
    );

}
