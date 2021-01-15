package HackerRank;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue. Initial positions increment by  from  at the front of the line to  at the back.

        Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if  and  bribes , the queue will look like this: .

        Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state. If anyone has bribed more than two people, the line is too chaotic to compute the answer.

        Function Description

        Complete the function minimumBribes in the editor below.

        minimumBribes has the following parameter(s):

        int q[n]: the positions of the people after all bribes
        Returns

        No value is returned. Print the minimum number of bribes necessary or Too chaotic if someone has bribed more than  people.
        Input Format

        The first line contains an integer , the number of test cases.

        Each of the next  pairs of lines are as follows:
        - The first line contains an integer , the number of people in the queue
        - The second line has  space-separated integers describing the final state of the queue.


 */
public class NewYearsEvenChaos {

    public void minimumBribes(int[] q){
        int count = 0;
        int check = 0;
        int temp = 0;

        boolean isSorted = false;

        int[] bribe = new int[100000];

        while(!isSorted){
            isSorted = true;

            for(int i = q.length -1; i > 0; i--){
                if(q[i] < q[i-1]){
                    temp = q[i-1];
                    q[i-1] = q[i];
                    q[i] = temp;
                    bribe[q[i]]++;
                    count++;

                    if(bribe[q[i]] > 2){
                        System.out.println("Too chaotic");
                        check++;
                        break;
                    }
                    isSorted = false;
                }
            }
        }
        if(check == 0){
            System.out.println(count);
        }
    }
}
