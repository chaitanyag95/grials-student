package student

class Course {
    Student student //one to one relationship


    static belongsTo = [student:Student]


    static constraints = {
    }
}
