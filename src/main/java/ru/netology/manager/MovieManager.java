package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {

    private MovieItem[] items = new MovieItem[0];

    int feedLength = 10;

    public MovieManager(int feedLength) {
        this.feedLength = feedLength;
    }

    public MovieManager() {
    }


    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getTen() {

        int length = items.length;

        if (length > 10) {
            length = items.length - 1;
        } else {
            length = items.length;
        }
        MovieItem[] result = new MovieItem[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[i];
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
