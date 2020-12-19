package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BillboardManagerTest {

    BillboardManager manager = new BillboardManager();

    @Test
    public void shouldOverTenMovie() {
        MovieItem first = new MovieItem(1, 1, "first");
        MovieItem second = new MovieItem(2, 2, "second");
        MovieItem third = new MovieItem(3, 3, "third");
        MovieItem fourth = new MovieItem(4, 4, "fourth");
        MovieItem fifth = new MovieItem(5, 5, "fifth");
        MovieItem sixth = new MovieItem(6, 6, "sixth");
        MovieItem seventh = new MovieItem(7, 7, "seventh");
        MovieItem eighth = new MovieItem(8, 8, "eighth");
        MovieItem ninth = new MovieItem(9, 9, "ninth");
        MovieItem tenth = new MovieItem(10, 10, "tenth");
        MovieItem eleventh = new MovieItem(11, 11, "eleventh");


        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);

        MovieItem[] actual = manager.getLastAdded();
        MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBelowTenMovie(){
        MovieItem first = new MovieItem(1, 1, "first");
        MovieItem second = new MovieItem(2, 2, "second");
        MovieItem third = new MovieItem(3, 3, "third");
        MovieItem fourth = new MovieItem(4, 4, "fourth");
        MovieItem fifth = new MovieItem(5, 5, "fifth");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);

        MovieItem[] actual = manager.getLastAdded();
        MovieItem[] expected = new MovieItem[]{fifth,fourth,third,second,first};
        assertArrayEquals(expected, actual);

    }
}