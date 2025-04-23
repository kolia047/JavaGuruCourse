package Lesson_9;

import java.util.ArrayList;
import java.util.List;

class BusinessLogic {
    private Dairy dairy;

    public BusinessLogic() {
        this.dairy = new Dairy();
    }


    public void addMark(String subject, int mark) {
        Mark newMark = new Mark(subject, mark);
        dairy.addMark(newMark);

    }

    public List<Mark> findMarksBySubject(String subject) {

        List<Mark> subjectMarks = new ArrayList<>();

        for (Mark mark : dairy.getMarks()) {
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

    public int findBestMark(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        int bestMark = subjectMarks.get(0).getMark();
        for (Mark mark : subjectMarks) {
            if (mark.getMark() > bestMark) {
                bestMark = mark.getMark();
            }
        }
        return bestMark;
    }

    public List<Mark> getAllMarks(){
        return dairy.getMarks();
    }
}
