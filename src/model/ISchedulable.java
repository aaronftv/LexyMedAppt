package model;

import java.util.Date;

public interface ISchedulable {
    void schedule(Date date, String time);

    default void defMethod(){
        
    }
}
