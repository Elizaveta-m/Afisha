package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    private MovieManager manager = new MovieManager();
    private MovieItem first = new MovieItem(1, 1, "Bloodshot", "action", "url1", false);
    private MovieItem second = new MovieItem(2, 2, "Onward", "cartoon", "url2", false);
    private MovieItem third = new MovieItem(3, 3, "Belgrade hotel", "comedy", "url3", false);
    private MovieItem fourth = new MovieItem(4, 4, "Gentlemen", "action", "url4", false);
    private MovieItem fifth = new MovieItem(5, 5, "Invisible man", "horror", "url5", false);
    private MovieItem sixth = new MovieItem(6, 6, "The trolls", "cartoon", "url6", true);
    private MovieItem seventh = new MovieItem(7, 7, "Number one", "action", "url7", true);
    private MovieItem eighth = new MovieItem(8, 8, "No time to die", "action", "url8", false);
    private MovieItem ninth = new MovieItem(9, 9, "My little pony", "cartoon", "url9", true);
    private MovieItem tenth = new MovieItem(10, 10, "Malignant", "thriller", "url10", false);
    private MovieItem eleventh = new MovieItem(11, 11, "Milk", "drama", "url11", false);

    @Test
    public void shouldShowFeedDefault() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        MovieItem[] actual = manager.getTen(10);
        MovieItem[] expected = new MovieItem[]{
                tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMovieAndGet() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        MovieItem[] actual = manager.getTen(3);
        MovieItem[] expected = new MovieItem[]{third, second, first};
        assertArrayEquals(expected, actual);
    }
}