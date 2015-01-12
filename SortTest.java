import java.util.Arrays;




public class SortTest {
	
	private static int count=0;
	
	public static void main(String[] args){
		
		//setting up test arrays
		// 3 arrays for each size, size 5, 20, 50
		long startTime, endTime;
		int size = 5;
		int size2 = 20;
		int size3 = 50;
		
		/********************DECLARING 1************************/
		
		Integer[] a = new Integer[size];
		Integer[] b =new Integer[size];
		
		for(int i=0; i<size; i++){
			a[i]=b[i]=(int)(Math.random()*100);
			
		}
		
		Integer[] a1 = new Integer[size];
		Integer[] b1 =new Integer[size];
		
		for(int i=0; i<size; i++){
			a1[i]=b1[i]=(int)(Math.random()*100);
			
		}
		
		Integer[] a2 = new Integer[size];
		Integer[] b2 =new Integer[size];
		
		for(int i=0; i<size; i++){
			a2[i]=b2[i]=(int)(Math.random()*100);
			
		}
		
		
		/********************DECLARING 2 *************************/
		
		
		
		Integer[] c = new Integer[size2];
		Integer[] d =new Integer[size2];
		
		for(int i=0; i<size2; i++){
			c[i]=d[i]=(int)(Math.random()*100);
			
		}
		
		Integer[] c1 = new Integer[size2];
		Integer[] d1 =new Integer[size2];
		
		for(int i=0; i<size2; i++){
			c1[i]=d1[i]=(int)(Math.random()*100);
			
		}
		
		Integer[] c2 = new Integer[size2];
		Integer[] d2 =new Integer[size2];
		
		for(int i=0; i<size2; i++){
			c2[i]=d2[i]=(int)(Math.random()*100);
			
		}
		
		
		
		
		
		/********************DECLARING 3***********************/
		
		
		Integer[] e = new Integer[size3];
		Integer[] f =new Integer[size3];
		
		for(int i=0; i<size3; i++){
			e[i]=f[i]=(int)(Math.random()*100);
			
		}
		
		Integer[] e1 = new Integer[size3];
		Integer[] f1 =new Integer[size3];
		
		for(int i=0; i<size3; i++){
			e1[i]=f1[i]=(int)(Math.random()*100);
			
		}
		
		Integer[] e2 = new Integer[size3];
		Integer[] f2 =new Integer[size3];
		
		for(int i=0; i<size3; i++){
			e2[i]=f2[i]=(int)(Math.random()*100);
			
		}
		
		
		/********************* DECLARING SORT() ************************/
		int [] x = new int[size];
	
		
		for(int i=0; i<size; i++){
			x[i]=(int)(Math.random()*100);
			
		}
		
		int[] y = new int[size2];
	
		
		for(int i=0; i<size2; i++){
			y[i]=(int)(Math.random()*100);
			
		}
		
		
		int[] z = new int[size3];
	
		
		for(int i=0; i<size3; i++){
			z[i]=(int)(Math.random()*100);
			
		}
		
		
		/********************* SORTING ************************/
		
		
		
		
		//BUBBLESORT
		System.out.println("BUBBLE SORT TEST:");
		
		
		//print unsorted array
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");	
		}
		System.out.println("");
		int count = 0;
		startTime = System.nanoTime();
		
		//sort the array	
		bubblesort(a);
		
		
		//get elapsed time
		endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		System.out.println("Start Time= " +startTime);
		System.out.println("End Time= " +endTime);
		
		//print sorted array
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
		System.out.println("bubblesort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		
		
		//ÊrestoreÊarray
		count=0;
		for(int i=0; i<size; i++){
			a[i]=b[i];
		}

		System.out.println("");
		
		//print unsorted array
		for(int i=0; i<a1.length; i++){
			System.out.print(a1[i] + " ");	
		}
		System.out.println("");
		count = 0;
		startTime = System.nanoTime();
		
		//sort the array	
		bubblesort(a1);
		
		
		//get elapsed time
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Start Time= " +startTime);
		System.out.println("End Time= " +endTime);
		
		//print sorted array
		for(int i=0; i<a1.length; i++){
			System.out.print(a1[i] + " ");
		}
		
		System.out.println("");
		System.out.println("bubblesort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		
		
		//ÊrestoreÊarray
		count=0;
		for(int i=0; i<size; i++){
			a1[i]=b1[i];
		}

		System.out.println("");


		//print unsorted array
		for(int i=0; i<a2.length; i++){
			System.out.print(a2[i] + " ");	
		}
		System.out.println("");
		count = 0;
		startTime = System.nanoTime();
		
		//sort the array	
		bubblesort(a2);
		
		
		//get elapsed time
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Start Time= " +startTime);
		System.out.println("End Time= " +endTime);
		
		//print sorted array
		for(int i=0; i<a2.length; i++){
			System.out.print(a2[i] + " ");
		}
		
		System.out.println("");
		System.out.println("bubblesort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		
		
		//ÊrestoreÊarray
		count=0;
		for(int i=0; i<size; i++){
			a2[i]=b2[i];
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");

		
		
		
		
		//INSERTION SORT
		System.out.println("INSERT SORT");
		//print unsorted array
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");	
		}
		System.out.println("");
		startTime = System.nanoTime();
		
		
		
		//sort the array	
		insertionsort(a);
				
		
		
		//get elapsed time
				endTime = System.nanoTime();
				 elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				
		//print sorted array
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
				
		System.out.println("");
		System.out.println("Insertion Sort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		
		//ÊrestoreÊarray
		count=0;
		for(int i=0; i<size; i++){
			a[i]=b[i];
		}

		System.out.println("");

		//print unsorted array
		for(int i=0; i<a1.length; i++){
			System.out.print(a1[i] + " ");	
		}
		System.out.println("");
		count = 0;
		startTime = System.nanoTime();
		
		//sort the array	
		insertionsort(a1);
		
		
		//get elapsed time
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Start Time= " +startTime);
		System.out.println("End Time= " +endTime);
		
		//print sorted array
		for(int i=0; i<a1.length; i++){
			System.out.print(a1[i] + " ");
		}
		
		System.out.println("");
		System.out.println("bubblesort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		
		
		//ÊrestoreÊarray
		count=0;
		for(int i=0; i<size; i++){
			a1[i]=b1[i];
		}

		System.out.println("");


		//print unsorted array
		for(int i=0; i<a2.length; i++){
			System.out.print(a2[i] + " ");	
		}
		System.out.println("");
		count = 0;
		startTime = System.nanoTime();
		
		//sort the array	
		insertionsort(a2);
		
		
		//get elapsed time
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Start Time= " +startTime);
		System.out.println("End Time= " +endTime);
		
		//print sorted array
		for(int i=0; i<a2.length; i++){
			System.out.print(a2[i] + " ");
		}
		
		System.out.println("");
		System.out.println("bubblesort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		
		
		//ÊrestoreÊarray
		count=0;
		for(int i=0; i<size; i++){
			a2[i]=b2[i];
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");




		
		

		
		

		
		
		
		// SHELL SORT
		  
		System.out.println("SHELL SORT TEST");
		
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");

		startTime = System.nanoTime();
		
		//sort the array	
		shellsort(a);
				
		//get elapsed time
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Start Time= " +startTime);
		System.out.println("End Time= " +endTime);
				
		//print sorted array
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Shell sort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					a[i]=b[i];
				}
		
		
		
		System.out.println("");

		//print unsorted array
		for(int i=0; i<a1.length; i++){
			System.out.print(a1[i] + " ");	
		}
		System.out.println("");
		count = 0;
		startTime = System.nanoTime();
		
		//sort the array	
		shellsort(a1);
		
		
		//get elapsed time
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Start Time= " +startTime);
		System.out.println("End Time= " +endTime);
		
		//print sorted array
		for(int i=0; i<a1.length; i++){
			System.out.print(a1[i] + " ");
		}
		
		System.out.println("");
		System.out.println("bubblesort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		
		
		//ÊrestoreÊarray
		count=0;
		for(int i=0; i<size; i++){
			a1[i]=b1[i];
		}

		System.out.println("");


		//print unsorted array
		for(int i=0; i<a2.length; i++){
			System.out.print(a2[i] + " ");	
		}
		System.out.println("");
		count = 0;
		startTime = System.nanoTime();
		
		//sort the array	
		shellsort(a2);
		
		
		//get elapsed time
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Start Time= " +startTime);
		System.out.println("End Time= " +endTime);
		
		//print sorted array
		for(int i=0; i<a2.length; i++){
			System.out.print(a2[i] + " ");
		}
		
		System.out.println("");
		System.out.println("bubblesort took " + count + " moves to sort " + size + " items");
		System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
		
		
		
		//ÊrestoreÊarray
		count=0;
		for(int i=0; i<size; i++){
			a2[i]=b2[i];
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
	
		
		
		
		
				
		/*******************************SIZE 20************************************************/
		
		System.out.println("SIZE = 20");
		
		
				//BUBBLESORT
				System.out.println("BUBBLE SORT TEST:");
				
				
				//print unsorted array
				for(int i=0; i<c.length; i++){
					System.out.print(c[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				bubblesort(c);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c.length; i++){
					System.out.print(c[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					c[i]=d[i];
				}

				System.out.println("");
				
				//print unsorted array
				for(int i=0; i<c1.length; i++){
					System.out.print(c1[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				bubblesort(c1);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c1.length; i++){
					System.out.print(c1[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					c1[i]=d1[i];
				}

				System.out.println("");
				
				
				//print unsorted array
				for(int i=0; i<c2.length; i++){
					System.out.print(c2[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				bubblesort(c2);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c2.length; i++){
					System.out.print(c2[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					c2[i]=d2[i];
				}

				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				
				
				
				//INSERTION SORT
				System.out.println("INSERT SORT");
				//print unsorted array
				//print unsorted array
				for(int i=0; i<c.length; i++){
					System.out.print(c[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				insertionsort(c);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c.length; i++){
					System.out.print(c[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size2; i++){
					c[i]=d[i];
				}

				System.out.println("");
				
				//print unsorted array
				for(int i=0; i<c1.length; i++){
					System.out.print(c1[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				insertionsort(c1);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c1.length; i++){
					System.out.print(c1[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					c1[i]=d1[i];
				}

				System.out.println("");
				
				
				//print unsorted array
				for(int i=0; i<c2.length; i++){
					System.out.print(c2[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				insertionsort(c2);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c2.length; i++){
					System.out.print(c2[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					c2[i]=d2[i];
				}

				System.out.println("");
				System.out.println("");
				System.out.println("");
		
				
				//SHELL SORT
				System.out.println("SHELL SORT");
				//print unsorted array
				//print unsorted array
				for(int i=0; i<c.length; i++){
					System.out.print(c[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				shellsort(c);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c.length; i++){
					System.out.print(c[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					c[i]=d[i];
				}

				System.out.println("");
				
				//print unsorted array
				for(int i=0; i<c1.length; i++){
					System.out.print(c1[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				shellsort(c1);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c1.length; i++){
					System.out.print(c1[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					c1[i]=d1[i];
				}

				System.out.println("");
				
				
				//print unsorted array
				for(int i=0; i<c2.length; i++){
					System.out.print(c2[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				shellsort(c2);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<c2.length; i++){
					System.out.print(c2[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size2 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					c2[i]=d2[i];
				}

				System.out.println("");
				System.out.println("");
				System.out.println("");
						
				/**********************************SIZE 50 *********************************************/
				
		
				System.out.println("SIZE = 20");
				
				
				//BUBBLESORT
				System.out.println("BUBBLE SORT TEST:");
				
				
				//print unsorted array
				for(int i=0; i<e.length; i++){
					System.out.print(e[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				bubblesort(e);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e.length; i++){
					System.out.print(e[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e[i]=f[i];
				}

				System.out.println("");
		
				
				
				//print unsorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e1[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				bubblesort(e1);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e1[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e1[i]=f1[i];
				}

				System.out.println("");
				
				//print unsorted array
				for(int i=0; i<e2.length; i++){
					System.out.print(e2[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				bubblesort(e2);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e2[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e2[i]=f2[i];
				}

				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				
				
				
				//INSERTION SORT
				System.out.println("INSERT SORT");
				//print unsorted array
				for(int i=0; i<e.length; i++){
					System.out.print(e[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				insertionsort(e);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e.length; i++){
					System.out.print(e[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e[i]=f[i];
				}

				System.out.println("");
		
				
				
				//print unsorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e1[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				insertionsort(e1);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e1[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e1[i]=f1[i];
				}

				System.out.println("");
				
				//print unsorted array
				for(int i=0; i<e2.length; i++){
					System.out.print(e2[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				insertionsort(e2);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e2[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e2[i]=f2[i];
				}

				System.out.println("");
				System.out.println("");
				System.out.println("");
				
						

				
				

				
				
				
				// SHELL SORT
				  
				System.out.println("SHELL SORT TEST");
				
				//print unsorted array
				for(int i=0; i<e.length; i++){
					System.out.print(e[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				shellsort(e);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e.length; i++){
					System.out.print(e[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e[i]=f[i];
				}

				System.out.println("");
		
				
				
				//print unsorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e1[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				shellsort(e1);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e1[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e1[i]=f1[i];
				}

				System.out.println("");
				
				//print unsorted array
				for(int i=0; i<e2.length; i++){
					System.out.print(e2[i] + " ");	
				}
				System.out.println("");
				 count = 0;
				startTime = System.nanoTime();
				
				//sort the array	
				shellsort(e2);
				
				
				//get elapsed time
				endTime = System.nanoTime();
				elapsedTime = endTime - startTime;
				System.out.println("Start Time= " +startTime);
				System.out.println("End Time= " +endTime);
				
				//print sorted array
				for(int i=0; i<e1.length; i++){
					System.out.print(e2[i] + " ");
				}
				
				System.out.println("");
				System.out.println("bubblesort took " + count + " moves to sort " + size3 + " items");
				System.out.println(" \t in : " + elapsedTime +  " nanoseconds");
				
				
				
				//ÊrestoreÊarray
				count=0;
				for(int i=0; i<size; i++){
					e2[i]=f2[i];
				}

				System.out.println("");
				System.out.println("");
				System.out.println("");
				
		
	/**********************************SORT METHOD ARRAY CLASS *********************************************/
		startTime = System.nanoTime();						
		Arrays.sort(x);
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("It took : " + elapsedTime +  " nanoseconds for a size 5 array");
		
		startTime = System.nanoTime();
		Arrays.sort(y);
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("It took : " + elapsedTime +  " nanoseconds for a size 20 array");
		
		startTime = System.nanoTime();
		Arrays.sort(z);
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("It took : " + elapsedTime +  " nanosecondsfor a size 50 array");
				
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static <AnyType extends Comparable<? super AnyType>> void bubblesort(AnyType [] a){
		
		for(int i= 0; i<a.length; i++){
			for(int j = 0; j<a.length-1; j++){
				if(a[j].compareTo(a[j+1])>0){
					AnyType tmp = a[j];
					count++;
					a[j]=a[j+1];
					count++;
					a[j+1]=tmp;
					count++;
				}
			}
	}
	
}
	public static void insertionsort(Integer[] a){
		
		for(int i=1; i<a.length; i++){
			int tmp = a[i];
			count++;
			int j =i-1;
			while(( j>-1) && a[j] >tmp){
				a[j+1]=a[j];
				count++;
				j--;
			
			}
			a[j+1] = tmp;
			count++;
		}
	}
	
		



	
	public static void shellsort(Integer[] a) {
		
		int inc = a.length / 2;
		while (inc > 0) {
			for (int i = inc; i < a.length; i++) {
				int j = i;
				int tmp = a[i];
				count++;
				while (j >= inc && a[j - inc] > tmp) {
					a[j] = a[j - inc];
					j = j - inc;
				}
				a[j] = tmp;
				count++;
			}
			if (inc == 2) {
				inc = 1;
			} else {
				inc *= (5.0 / 11);
			}
		}
	}
	
}
