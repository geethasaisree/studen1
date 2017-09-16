public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		int i=this.students.length;
		for(int j=i;j>0;j--)
		this.students[j]=this.students[j-1];
		this.students[0]=student;
		this.students[i+1]=null;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int i=this.students.length;
		this.students[i]=student;
		this.students[i+1]=null;
	}

	@Override
	public void add(Student student, int index) {
		int i=this.students.length;
		for(int j=i;j>index;j--)
		this.students[j]=this.students[j-1];
		this.students[index]=student;
		this.students[i+1]=null;
	}

	@Override
	public void remove(int index) {
		int i=this.students.length;
		for(int j= index;j<i;j++)
		this.students[j]=this.students[j+1];
		this.students[i+1]=null;
	}

	@Override
	public void remove(Student student) {
		int i=this.students.length;
		int index=0;
             for(int j=0;j<i;j++)
		if(this.students[j].equals(student))
		{index=j;
		break;
                }
		for(int j=index;j<i;j++)
		this.students[j]=this.students[j+1];
		this.students[i+1]=null;
	}

	@Override
	public void removeFromIndex(int index) {
		int i=this.students.length;
		//this.students[index]=this.students[i];
		this.students[index]=null;
	}

	@Override
	public void removeFromElement(Student student) {
		int i=this.students.length;
		int index=0;
             for(int j=0;j<i;j++)
		if((this.students[j]).equals(student))
		{index=j;
		break;
                }
		//this.students[index]=this.students[i];
		this.students[index]=null;
	}

	@Override
	public void removeToIndex(int index) {
		int j=this.students.length;
		for(int i=0; i<= j-index;i++)
		this.students[i]=this.students[i+index+1];
		this.students[j+1]=null;
	}

	@Override
	public void removeToElement(Student student) {
		int i=this.students.length;
		int index=0;
             for(int j=0;j<i;j++)
		if((this.students[j]).equals(student))
		{index=j;
		break;
                }
		int j=this.students.length;
		for(i=0;i<=j-index;i++)
		this.students[i]=this.students[i+index+1];
		this.students[i+1]=null;
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int n=this.students.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if((this.students[j]).isGreaterThan(this.students[j+1]))
				{
                                   Student student= new Student();
				    student=this.students[i];
				    this.students[i]=this.students[j];
		    		    this.students[j]=student;
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int l=this.students.length;
		int max=this.students[0].avgMark;
		for(int i=0;i<l;i++)
		 if(this.students[i].avgMark > max)
			max=this.students[i].avgMark;

			Student students1[]= new Student();
			int k=0;
			for(int j=0;j<n;j++)
			{
                           if(this.students[i].avgMark == max)
				students1[k++]=this.students[i];
                         }
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
@Override
	public Student getStudent(int index) {
		Student studentInformation = new Student();

 System.out.println(studentInformation[index].getId()+""+studentInformation[index].getFullName() +""+studentInformation[index].getBirthDate() +""+studentInformation[index].getAvgMark());

		return null;
	}
	public Student[] getStudents() {
		// Add your implementation here
		Student studentInformation = new Student();
		for (int i = 0; i < studentInformation.size; i++)
        {
            System.out.println(studentInformation[i].getId()+""+studentInformation[i].getFullName() +""+studentInformation[i].getBirthDate() +""+studentInformation[i].getAvgMark());
        }


		return null;
	}


