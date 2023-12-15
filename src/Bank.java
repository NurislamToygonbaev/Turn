import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.PriorityQueue;
import java.util.Queue;

public class Bank {

    // priority переводы. по очереди
    public String perevody(int count, Queue<Talon> queue) {
        Talon talon = new Talon();
        talon.setStr("M" + count);
        talon.setTime(LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))));
        queue.add(talon);
        return "Successfully";
    }

    // priority в первый очередь! касса
    public String kassa(int count, Queue<Talon> queue) {
        Talon talon = new Talon();
        talon.setStr("A" + count);
        talon.setTime(LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))));
        queue.add(talon);
        return "Successfully";
    }

    // priority  юр. лицо после кассы!
    public String urLits(int count, Queue<Talon> queue) {
        Talon talon = new Talon();
        talon.setStr("K" + count);
        talon.setTime(LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))));
        queue.add(talon);
        return "Successfully";
    }

    // priority удаляет начиная с буквы "A" и по принцибу FIFO
    public String call(Queue<Talon> queue) {
        Queue<Talon> talonQueue = new PriorityQueue<>(queue);
        talonQueue.poll();
        queue.clear();
        queue.addAll(talonQueue);
        return "call";
    }

}
