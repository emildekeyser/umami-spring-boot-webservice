package umami;

import umami.model.DayMenu;
import umami.model.Dish;

import java.time.LocalDate;


public class MenuBuilder {
    private LocalDate date;
    private Dish soep;
    private Dish dagschotel;
    private Dish veggie;

    public static MenuBuilder aMenu() {
        return new MenuBuilder()
                .withDate(LocalDate.of(2000, 1, 1))
                .withSoep(DishBuilder.aMeatDish().build())
                .withDagschotel(DishBuilder.aMeatDish().build())
                .withVeggie(DishBuilder.aVegDish().build());
    }

    private MenuBuilder withDate(LocalDate date) {
        this.date = date;
        return this;
    }

    private MenuBuilder withSoep(Dish soep) {
        this.soep = soep;
        return this;
    }


    private MenuBuilder withDagschotel(Dish dagschotel) {
        this.dagschotel = dagschotel;
        return this;
    }

    private MenuBuilder withVeggie(Dish veggie) {
        this.veggie = veggie;
        return this;
    }

    public DayMenu build() {
        DayMenu menu = new DayMenu();
        menu.setDate(this.date);
        menu.setSoep(this.soep);
        menu.setDagschotel(this.dagschotel);
        menu.setVeggie(this.veggie);
        return menu;
    }
}


