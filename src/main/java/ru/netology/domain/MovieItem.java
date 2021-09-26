package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class MovieItem {

    private int id;
    private int filmId;
    private String name;
    private String genre;
    private String imageUrl;
    private boolean isPremiere;

}
