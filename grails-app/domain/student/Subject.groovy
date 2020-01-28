package student

class Subject {
    static belongsTo = [student:Student]

    //bidirectional one to many relationship
    //if you comment the above line then relationship is unidirectional one to many relationship

    static constraints = {
    }
}
