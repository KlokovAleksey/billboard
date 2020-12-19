package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class BillboardManager {
    private MovieItem[] items = new MovieItem[0];
    private int lastAdded = 10;

    public void addMovie(MovieItem item) {

        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {

        MovieItem[] result = new MovieItem[items.length];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public MovieItem[] getLastAdded() {
        int lotMovies = items.length;
        if (lotMovies > lastAdded) {
            lotMovies = lastAdded;
        }
        MovieItem[] result = new MovieItem[items.length];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}