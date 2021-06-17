package SMBGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SMBScrollpanel extends JPanel{

	/*
	 * author: jeder49
	 * date: 12.06.21
	 *
	 * */
	Border border = BorderFactory.createLineBorder(Color.BLUE, 5);

	//first element of dynamic list of objects that are listed in the panel
	private Item item = null;

	//meta data panel
	private boolean visible = true;
	private int heightPanel;
	private int widthPanel;
	private int xPanel;
	private int yPanel;

	//distance of the
	double verticalDistancePercentage = 1;
	double horizontalDistancePercentage = 1;

	//VERTICAL
	//visibility of the vertical bar
	private boolean verticalVisiblity = true;

		//bar
		private JPanel verticalBar;
		private int heightVerticalBar;
		private int widthVerticalBar;
		private int xVerticalBar;
		private int yVerticalBar;

		//slider
		private JPanel verticalSlider;

			//if the size of the slider should be auto
			private boolean autoSizevertical;

			//meta data
			private int heightVerticalSlider;
			private int widthVerticalSlider;
			private int xVerticalSlider;
			private int yVerticalSlider;

	//HORIZONTAL
	//visibility of the horizontal bar
	private boolean horisontalVisiblity = true;

		//bar
		private JPanel horisontalBar;
		private int heightHorizontalBar;
		private int widthHorizontalBar;
		private int xHorizontalBar;
		private int yHorizontalBar;

		//slider
		private JPanel horisontalSlider;

			//if the size of the slider should be auto
			private boolean autoSizeHorizontal;

			//meta data
			private int heightHorizontalSlider;
			private int widthHorizontalSlider;
			private int xHorizontalSlider;
			private int yHorizontalSlider;


	//todo: mouse weal listener; keyboard listener; animation for going thought elements; animation for

	public SMBScrollpanel(int x,int y,int width,int height) {
		xPanel = x;
		yPanel = y;
		widthPanel = width;
		heightPanel = height;

		//{panel
		this.setBounds(x, y, width, height);
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {

				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {

				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

			//
			int verticalDistance = (int)(widthPanel * verticalDistancePercentage);
			int horizontalDistance = (int)(heightPanel * horizontalDistancePercentage);

			//horisontalBar
			horisontalBar = new JPanel();
			horisontalBar.setBorder(border);

				//position
				xHorizontalBar = widthPanel - horizontalDistance;
				yHorizontalBar = 0;
				horisontalBar.setBounds(xHorizontalBar, yHorizontalBar, widthHorizontalBar, heightHorizontalBar);

				//visibility
				horisontalBar.setVisible(horisontalVisiblity);

				horisontalBar.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}

			});

			//horisontalSlider
			horisontalSlider = new JPanel();
			horisontalSlider.setBorder(border);

				//position
				xHorizontalSlider = widthPanel - horizontalDistance;
				yHorizontalSlider = 0;
				horisontalBar.setBounds(xHorizontalSlider, yHorizontalSlider, widthHorizontalSlider, heightHorizontalSlider);

				//visibility
				horisontalBar.setVisible(horisontalVisiblity);

				horisontalSlider.addMouseMotionListener(new MouseMotionListener() {
				//when a
				@Override
				public void mouseDragged(MouseEvent arg0) {
				}

				//
				@Override
				public void mouseMoved(MouseEvent arg0) {
				}
			});

			//verticalBar
			verticalBar = new JPanel();
			verticalBar.setBorder(border);

				//position
				xVerticalBar = 0;
				yVerticalBar = heightPanel - verticalDistance;
				horisontalBar.setBounds(xVerticalBar, yVerticalBar, widthVerticalBar, heightVerticalBar);

				//visibility
				horisontalBar.setVisible(verticalVisiblity);

				verticalBar.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}

			});

			//verticalSlider
			verticalSlider = new JPanel();
			verticalSlider.setBorder(border);

				//position
				xVerticalSlider = 0;
				yVerticalSlider = heightPanel - verticalDistance;
				horisontalBar.setBounds(xVerticalSlider, yVerticalSlider, widthVerticalSlider, heightVerticalSlider);

				//visibility
				horisontalBar.setVisible(verticalVisiblity);

				verticalSlider.addMouseMotionListener(new MouseMotionListener() {
				//
				@Override
				public void mouseDragged(MouseEvent arg0) {
				}

				//
				@Override
				public void mouseMoved(MouseEvent arg0) {
				}
			});

			//
			//coment: if it should only move when the mouse is inside the panel you may have to add a Mouselistener
			verticalSlider.addMouseWheelListener(new MouseWheelListener() {

				@Override
				public void mouseWheelMoved(MouseWheelEvent arg0) {

				}

			});

		//end panel}
		this.setVisible(true);
	}

	//
	public void setVisible(boolean b) {
		visible = b;
	}

	//
	public boolean isVisible() {
		return visible;
	}

	//the x and y position of the panel are set to new values
	public boolean setPosition(int position[]) {
		if(position.length >= 2) {
			xPanel = position[0];
			yPanel = position[1];
			return true;
		}else {
			return false;
		}
	}

	//returns the x and y position of the panel
	public int[] getPosition() {
		int position[] = new int[2];
		position[0] = xPanel;
		position[1] = yPanel;
		return position;
	}

	//the width of the panel is set to a new value
	public void setWidth(int i) {
		widthPanel = i;
		//new calculation of the bar and sider
	}

	//returns the width of the panel
	public int getWidth() {
		return widthPanel;
	}

	//the height of the panel is set to a new value
	public void setHeight(int i) {
		heightPanel = i;
		//new calculation of the bar and sider
	}

	//returns the height of the panel
	public int getHeight() {
		return heightPanel;
	}

	//
	public void setHorisontalVisiblity(boolean b) {
		horisontalVisiblity = b;
	}

	//
	public void setVerticalVisiblity(boolean b) {
		verticalVisiblity = b;
	}

	//
	public boolean isHorisontalVisible(boolean b) {
		return horisontalVisiblity;
	}

	//
	public boolean isVerticalVisible(boolean b) {
		return verticalVisiblity;
	}

	//
	public void addItem(JLabel l) {
		if(item == null) {
			item = new Item(null, null);
			item.add(l);
		}else {
			Item cursor = item;
			while(cursor.getNextItem() != null) {
				cursor = cursor.getNextItem();
			}
			cursor.setNextItem(new Item(null,cursor));
			cursor = cursor.getNextItem();
			cursor.add(l);
		}
		this.add(l);
	}

	//
	public void addItem(JPanel p) {
		if(item == null) {
			item = new Item(null, null);
			item.add(p);
		}else {
			Item cursor = item;
			while(cursor.getNextItem() != null) {
				cursor = cursor.getNextItem();
			}
			cursor.setNextItem(new Item(null,cursor));
			cursor = cursor.getNextItem();
			cursor.add(p);
		}
		this.add(p);
	}

	//
	public void addItem(JButton b) {
		if(item == null) {
			item = new Item(null, null);
			item.add(b);
		}else {
			Item cursor = item;
			while(cursor.getNextItem() != null) {
				cursor = cursor.getNextItem();
			}
			cursor.setNextItem(new Item(null,cursor));
			cursor = cursor.getNextItem();
			cursor.add(b);
		}
		this.add(b);
	}

	//
	public void addItem(SMBButton b) {
		if(item == null) {
			item = new Item(null, null);
			item.add(b);
		}else {
			Item cursor = item;
			while(cursor.getNextItem() != null) {
				cursor = cursor.getNextItem();
			}
			cursor.setNextItem(new Item(null,cursor));
			cursor = cursor.getNextItem();
			cursor.add(b);
		}
		this.add(b);
	}

	//
	public int getIndex() {
		return 0;
	}

	//
	public void markItem(int i) {

	}

	//
	public void markItem(Item i) {

	}

	//
	public void deleteItem() {

	}

	//
	public Item getItem(int i) {
		return null;
	}

	//
	private class Item{
		//
		Item previousItem;
		//
		Item nextItem;

		//value
		JPanel panel;
		JLabel label;
		JButton button;
		SMBButton smbbutton;

		//
		int x,y,width,height;

		//
		public Item(Item previous, Item next) {
			previousItem = previous;
			nextItem = next;
		}

		//
		public void setNextItem(Item i) {
			nextItem = i;
		}

		//
		public void setPreviousItem(Item i) {
			previousItem = i;
		}

		//
		public Item getNextItem() {
			return nextItem;
		}

		//
		public Item getPreviousItem() {
			return previousItem;
		}

		//
		public void add(JPanel p) {
			panel = p;
		}

		//
		public void add(JLabel l) {
			label = l;
		}

		//
		public void add(JButton b) {
			button = b;
		}

		//
		public void add(SMBButton b) {
			smbbutton = b;
		}

		public Component getElement() {
			if(panel != null) {
				return panel;
			}else if(label != null) {
				return label;
			}else if(button != null) {
				return button;
			}else if(smbbutton != null) {
				return smbbutton;
			}else {
				return null;
			}
		}

		public void setPosition(int x, int y) {
			if(panel != null) {
				panel.setBounds(x, y, panel.getWidth(), panel.getHeight());
				return;
			}else if(label != null) {
				label.setBounds(x, y, label.getWidth(), label.getHeight());
				return;
			}else if(button != null) {
				button.setBounds(x, y, button.getWidth(), button.getHeight());
				return;
			}else if(smbbutton != null) {
				smbbutton.setBounds(x, y, smbbutton.getWidth(), smbbutton.getHeight());
				return;
			}else {
				return;
			}
		}

		public void changePositionBy(int x, int y) {
			if(panel != null) {
				panel.setBounds(this.x + x, this.y + y, panel.getWidth(), panel.getHeight());
				return;
			}else if(label != null) {
				label.setBounds(this.x + x, this.y + y, label.getWidth(), label.getHeight());
				return;
			}else if(button != null) {
				button.setBounds(this.x + x, this.y + y, button.getWidth(), button.getHeight());
				return;
			}else if(smbbutton != null) {
				smbbutton.setBounds(this.x + x, this.y +  y, smbbutton.getWidth(), smbbutton.getHeight());
				return;
			}else {
				return;
			}
		}

		public void setMarked(boolean b) {
			Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
			if(b) {
				if(panel != null) {
					panel.setBorder(border);
				}else if(label != null) {
					label.setBorder(border);
				}else if(button != null) {
					button.setBorder(border);
				}else if(smbbutton != null) {
					smbbutton.setBorder(border);
				}else {
					return;
				}
			}else {
				if(panel != null) {
					panel.setBorder(null);
				}else if(label != null) {
					label.setBorder(null);
				}else if(button != null) {
					button.setBorder(null);
				}else if(smbbutton != null) {
					smbbutton.setBorder(null);
				}else {
					return;
				}
			}
		}
	}
}
