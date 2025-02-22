package com.bootcamp.java.w20.be_java_hisp_w20_g05.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Collection;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class FollowedUsersPostsResponseDTO {
    @JsonProperty("user_id")
    private int userId;
    @JsonProperty("posts")
    private Collection<PostResponseDTO> posts;

}
