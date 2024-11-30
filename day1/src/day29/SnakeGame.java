package day29;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener {
    private static final int TILE_SIZE = 20;
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final int DELAY = 50; // 游戏速度

    private LinkedList<Point> snake;
    private Point food;
    private char direction;
    private boolean running;

    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        if (direction != 'D') direction = 'U';
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') direction = 'D';
                        break;
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') direction = 'L';
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') direction = 'R';
                        break;
                }
            }
        });
        initGame();
    }

    private void initGame() {
        snake = new LinkedList<>();
        snake.add(new Point(WIDTH / 2, HEIGHT / 2));
        direction = 'R';
        running = true;
        spawnFood();
        Timer timer = new Timer(DELAY, this);
        timer.start();
    }

    private void spawnFood() {
        Random rand = new Random();
        food = new Point(rand.nextInt(WIDTH), rand.nextInt(HEIGHT));
        while (snake.contains(food)) {
            food = new Point(rand.nextInt(WIDTH), rand.nextInt(HEIGHT));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (running) {
            g.setColor(Color.RED);
            g.fillRect(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            g.setColor(Color.GREEN);
            for (Point p : snake) {
                g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        } else {
            showGameOver(g);
        }
    }

    private void showGameOver(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Game Over", WIDTH * TILE_SIZE / 4, HEIGHT * TILE_SIZE / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkCollision();
            checkFood();
            repaint();
        }
    }

    private void move() {
        Point head = snake.getFirst();
        Point newHead = new Point(head.x, head.y);
        switch (direction) {
            case 'U':
                newHead.y--;
                break;
            case 'D':
                newHead.y++;
                break;
            case 'L':
                newHead.x--;
                break;
            case 'R':
                newHead.x++;
                break;
        }
        snake.addFirst(newHead);
        snake.removeLast(); // 删除尾部
    }

    private void checkCollision() {
        Point head = snake.getFirst();
        // 碰到墙壁或自身
        if (head.x < 0 || head.y < 0 || head.x >= WIDTH || head.y >= HEIGHT || snake.subList(1, snake.size()).contains(head)) {
            running = false;
        }
    }

    private void checkFood() {
        Point head = snake.getFirst();
        if (head.equals(food)) {
            snake.addFirst(new Point(food)); // 增加长度
            spawnFood(); // 重新生成食物
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("贪吃蛇游戏");
        SnakeGame game = new SnakeGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
