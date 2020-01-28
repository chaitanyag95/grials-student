package student

class Address {
    static belongsTo = [student:Student]
    //many to many relationship

    static constraints = {
    }
}
