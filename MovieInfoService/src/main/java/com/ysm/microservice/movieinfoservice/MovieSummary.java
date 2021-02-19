package com.ysm.microservice.movieinfoservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieSummary {

    private int id;

    private String imdb_id;

    private String original_language;

    private String original_title;

}