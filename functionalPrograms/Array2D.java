package functionalPrograms;

public class Array2D {
	

		public  void display() {
			// TODO Auto-generated method stub
			int choice = 0;
			int rows = 0,columns = 0;
			Utility utility = new Utility();
			System.out.println("Enter the choice");
			System.out.println("1. Create integer 2D array");
			System.out.println("2. Create double 2D array");
			System.out.println("3. Create boolean 2D array");
			choice = utility.getValue();
			
			if (choice > 0 && choice <= 3)
			{
				System.out.println("Enter rows and columns");
				rows = utility.getValue();
				columns = utility.getValue();
				Integer[][] i1 = new Integer[rows][columns];
				Double[][] d1 = new Double[rows][columns];
				Boolean[][] b1 = new Boolean[rows][columns];
				switch (choice)
				{
					case 1: 
							System.out.println("Enter integer elements");
							for(int i=0;i<rows;i++)
							{
								for(int j=0;j<columns;j++)
								{
									i1[i][j] = utility.getValue();
								}
							}
							utility.print2DArray(i1,rows,columns);
							break;
					case 2:
						System.out.println("Enter double type elements");
						for(int i=0;i<rows;i++)
						{
							for(int j=0;j<columns;j++)
							{
								d1[i][j] = utility.getDouble();
							}
						}
						utility.print2DArray(d1,rows,columns);
						break;
					case 3:
						System.out.println("Enter boolean elements (True/False)");
						for(int i=0;i<rows;i++)
						{
							for(int j=0;j<columns;j++)
							{
								b1[i][j] = utility.getBoolean();
							}
						}
						utility.print2DArray(b1,rows,columns);
						break;
					default:
							System.out.println("Invalid choice. Enter number from 1 to 3");
							choice = utility.getValue();
							if(choice > 3 && choice <= 0)
							{
								System.out.println("You have entered an invalid choice");
								System.exit(0);
							}
				}
			}
			else
			{
				System.out.println("You have entered wrong choice");
			}
		}

	}

