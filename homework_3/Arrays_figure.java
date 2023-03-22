package homework_3;

import java.util.ArrayList;
import java.util.List;

public class Arrays_figure<T extends Figure> {
    private List<T> arrFigure = new ArrayList();

    public void addFigure(T figure) {
        this.arrFigure.add(figure);

    }

    public void removeFigure(T figure) {
        this.arrFigure.remove(figure);
    }

    public void allPerimeter() {

    }

    public void allArea() {

    }
}
