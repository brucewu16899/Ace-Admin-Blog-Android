package com.csi0n.blog.business.pojo.model;

import com.csi0n.blog.business.pojo.model.ext.BaseModel;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

/**
 * Created by csi0n on 10/11/16.
 */

public class Article extends BaseModel {

    /**
     * id : 1
     * thumb :
     * title : 欢饮使用Blog
     * user_id : 1
     * cate_id : 2
     * content : 博客内容
     * sort : 0
     * created_at : 2016-10-09 16:39:14
     * updated_at : 2016-10-09 16:49:44
     */

    @SerializedName("id")
    public int id;
    @SerializedName("thumb")
    public String thumb;
    @SerializedName("title")
    public String title;
    @SerializedName("user_id")
    public int userId;
    @SerializedName("cate_id")
    public int cateId;
    @SerializedName("describe")
    public String describe;
    @SerializedName("content")
    public String content;
    @SerializedName("content_md")
    public String content_md;
    @SerializedName("css")
    public String css;
    @SerializedName("sort")
    public int sort;
    @SerializedName("created_at")
    public String createdAt;
    @SerializedName("updated_at")
    public String updatedAt;
    @SerializedName("tags")
    public Tag[] tags;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", thumb='" + thumb + '\'' +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", cateId=" + cateId +
                ", content='" + content + '\'' +
                ", sort=" + sort +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
