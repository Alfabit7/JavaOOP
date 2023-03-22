
package homework_3;

import homework_3.Interfaces.Perimeter;
import homework_3.Interfaces.Area;

public abstract class Figure implements Perimeter, Area {
    private String name;

    public Figure() {
        this.name = name;
    }

    private void countsPerimetr() {
        this.perimeter();
    }

    private void countsArea() {
        this.area();
    }
}