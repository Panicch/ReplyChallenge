package model;

import java.util.ArrayList;
import java.util.List;



public class Room implements IRoom{

    private class Row{
        List<Place> places;

        Row(int size){
            places = new ArrayList<>(size);
        }

        void setPlace(int index, Place place){
            places.add(index, place);
        }
    }


    private int length = -1;
    private int width = -1;

    private List<Row> rows;


    private void generateMatrix() {
        rows = new ArrayList<>(length);
        for (int i = 0; i <length; i++)
            rows.add(new Row(width));

    }

    @Override
    public void setLength(int l) {
        // y
        length = l;

        if(width > 0)
            generateMatrix();
    }

    @Override
    public void setWidth(int w) {
        // x
        width = w;

        if(length > 0)
            generateMatrix();
    }

    @Override
    public void setPlace(int x, int y, Place p) {
        if (x<0 || x>length || y<0 || y>width)
            return;

        rows.get(y).setPlace(x, p);
    }
}
