//Skeleton implementation of an Alley class  using passing-the-baton
//Mandatory assignment 2
//Course 02158 Concurrent Programming, DTU,  Fall 2023

//Hans Henrik Lovengreen     Sep 26, 2023

public class BatonAlley extends Alley {
    Semaphore[] baton = new Semaphore[1];

    protected BatonAlley() {
        baton[0] = new Semaphore(1);
    }

    /* Block until car no. may enter alley */
    public void enter(int no) throws InterruptedException {
        if (no < 5) {
            baton[0].P();
        } else {
            baton[0].P();
        }

    }

    /* Register that car no. has left the alley */
    public void leave(int no) {
        if (no < 5) {
            baton[0].V();
        } else {
            baton[0].V();
        }
    }

}
