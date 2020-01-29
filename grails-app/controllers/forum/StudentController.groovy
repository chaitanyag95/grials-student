package forum

class StudentController {

    def index() { }
    def save(){
        def student =new Student(params)
        student.save()

        //render "Successfully record inserted   !!!!!!!"
        //
        //render(view: "ViewRecord")
        redirect(action:'viewRecord')

    }
    def viewRecord()
    {
        print "Details"
        def students =Student.list()
        [students:students]
    }
}
