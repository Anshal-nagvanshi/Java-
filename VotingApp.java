import java.util.*;

class Candidate {
    String id;
    String name;
    int votes;

    Candidate(String id, String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;
    }
}

class Voter {
    String id;
    boolean voted;

    Voter(String id) {
        this.id = id;
        this.voted = false;
    }
}

public class VotingApp {
    static Scanner sc = new Scanner(System.in);

    static Candidate[] candidates = new Candidate[100];
    static Voter[] voters = new Voter[100];

    static int candidateCount = 0;
    static int voterCount = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.println();
            System.out.println("1. Register Candidate");
            System.out.println("2. Register Voter");
            System.out.println("3. Cast Vote");
            System.out.println("4. Display Result");
            System.out.println("5. Reset");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                registerCandidate();
            } else if (choice == 2) {
                registerVoter();
            } else if (choice == 3) {
                castVote();
            } else if (choice == 4) {
                displayResult();
            } else if (choice == 5) {
                resetAll();
            } else if (choice == 6) {
                System.out.println("Thank you.");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    static void registerCandidate() {
        System.out.print("Candidate ID: ");
        String id = sc.nextLine();
        System.out.print("Candidate Name: ");
        String name = sc.nextLine();

        for (int i = 0; i < candidateCount; i++) {
            if (candidates[i].id.equals(id)) {
                System.out.println("Candidate already exists.");
                return;
            }
        }

        candidates[candidateCount] = new Candidate(id, name);
        candidateCount++;

        System.out.println("Candidate added.");
    }

    static void registerVoter() {
        System.out.print("Voter ID: ");
        String id = sc.nextLine();

        for (int i = 0; i < voterCount; i++) {
            if (voters[i].id.equals(id)) {
                System.out.println("Voter already exists.");
                return;
            }
        }

        voters[voterCount] = new Voter(id);
        voterCount++;

        System.out.println("Voter registered.");
    }

    static void castVote() {
        System.out.print("Voter ID: ");
        String vid = sc.nextLine();

        Voter voter = null;
        int voterIndex = -1;

        for (int i = 0; i < voterCount; i++) {
            if (voters[i].id.equals(vid)) {
                voter = voters[i];
                voterIndex = i;
                break;
            }
        }

        if (voter == null) {
            System.out.println("No such voter.");
            return;
        }

        if (voter.voted) {
            System.out.println("Voter has already voted.");
            return;
        }

        System.out.println("Available Candidates:");
        for (int i = 0; i < candidateCount; i++) {
            System.out.println(candidates[i].id + " - " + candidates[i].name);
        }

        System.out.print("Vote for Candidate ID: ");
        String cid = sc.nextLine();

        Candidate selected = null;

        for (int i = 0; i < candidateCount; i++) {
            if (candidates[i].id.equals(cid)) {
                selected = candidates[i];
                break;
            }
        }

        if (selected == null) {
            System.out.println("Invalid candidate.");
            return;
        }

        selected.votes++;
        voters[voterIndex].voted = true;

        System.out.println("Vote recorded.");
    }

    static void displayResult() {
        System.out.println();
        System.out.println("--- Result ---");
        for (int i = 0; i < candidateCount; i++) {
            System.out.println(candidates[i].name + " : " + candidates[i].votes);
        }
    }

    static void resetAll() {
        candidateCount = 0;
        voterCount = 0;
        System.out.println("All data cleared.");
    }
}
