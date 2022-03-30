public class Cat implements Comparable<Cat>{
	
  private String mName;
  private String mBreed;
  private int mAge;

  public Cat(String name, String breed, int age) {
    mName = name;
    mBreed = breed;
    mAge = age;
  }

  @Override
  public String toString() {
    return "Cat [Name=" + mName + ", Breed=" + mBreed + ", Age=" + mAge + ", Human Age=" + ageInHumanYears() + "]";
  }

  public int ageInHumanYears() {
    if (mAge == 1)
      return 15;
    else if (mAge == 2)
      return 24;
    else
      return 24 + (mAge - 2) * 4;
  }

  @Override
  //Comparing to cat objects
  //First one is this
  //Second one is other
  public int compareTo(Cat other) {
    //Compare cats first by age (int)
    int ageComp = this.mAge - other.mAge;
    if(ageComp != 0)
      return ageComp;
    //The compare by  (String)
    int nameComp =  this.mName.compareToIgnoreCase(other.mName); // Goes through one letter at a time using ASCII , if you care about casing using .compareTo
    if(nameComp != 0)
      return nameComp;
    //Finally by breed (String)
    return this.mBreed.compareTo(other.mBreed); // Goes through one letter at a time using ASCII
  }
}

