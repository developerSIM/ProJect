package ex1;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cnt1 = new String[1000];
        String[] cnt2 = new String[2000];


        User[] userList = new User[1000];

        Board[] boardList = new Board[100];

        while (true) {
            System.out.print("1.회원가입 2.로그인 3.게시물작성 4.게시물출력 : ");
            int choose = scanner.nextInt();


            // 회원 가입 기능 하고 저장
            //1
            if (choose == 1) {
                scanner.nextLine();
                System.out.print("아이디를 적어주십시오. : ");
                String id = scanner.nextLine();
                System.out.print("비밀번호를 적어주십시오. : ");
                String Password = scanner.next();

                //2
                for (int index = 0; index < userList.length; index++) {
                    if (userList[index] == null) {
                        User user = new User();
                        Board board = new Board();
                        user.id = id;
                        user.pwd = Password;
                        userList[index] = user;
                        System.out.println("회원가입 성공!");
                        break;
                    }
                    else if (choose == 2) {
                        scanner.nextLine();
                        System.out.print("아이디 입력해주십시오 : ");
                        String id1 = scanner.nextLine();
                        System.out.print("비밀번호를 입력해주세요 :");
                        String Password1 = Scanner.nextLine();


                        boolean loginSuccess = false;

                        for (User user : userList){
                            if(user != null && user.id.equals(id) && user.pwd.equals(Password1)){
                                System.out.println("로그인되었습니다");
                                loginSuccess = true;
                                break;
                            }
                        }
                         if (!loginSuccess) {
                            System.out.print("로그인에 실패하였습니다.");
                        }
                        else if ( choose == 3){
                            scanner.nextLine();
                             System.out.println("내용: ");
                             String cnt3 = scanner.nextLine();
                             System.out.println("작성자: ");
                             String wtr3 = scanner.nextLine();
                             System.out.println("비밀번호 : ");
                             int pwd = scanner.nextInt();


                         }
                            for( int index1 = 0; index1 < boardList.length; index1++) {
                                if ( boardList[index1] == null) {
                                    Board board1 = new Board();
                                    board1.cnt = board1.cnt;
                                    board1.wtr= board1.wtr;
                                    board1.pwd = board1.pwd;
                                    boardList[index1] = board1;
                                    System.out.println("게시글이 등록되었습니다.");
                                    break;

                                }



                            }




                            }
                        }
                    }
                }
            }
        }
