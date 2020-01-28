package student

class Student {
    University university

   // static  hasOne = [course: Course]  //one to one relationship
    // hasOne only works with bidirectional relationships.


    static hasMany = [address:Address,subject:Subject]//many to many relationship //one to many relationship

    static constraints = {
    }
}


