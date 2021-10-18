package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {

    private MovieItem[] items = new MovieItem[0];

    private int feedLength = 10;

    public int getFeedLength() {
        return feedLength;
    }

    public void setFeedLength(int feedLength) {
        this.feedLength = feedLength;
    }

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
        int limit = getFeedLength();
        if (length > limit) {
            length = limit;
        } else {
            length = items.length;
        }
        MovieItem[] result = new MovieItem[length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
