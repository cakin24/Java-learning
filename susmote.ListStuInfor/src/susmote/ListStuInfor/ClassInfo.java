package susmote.ListStuInfor;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ClassInfo extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassInfo frame = new ClassInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClassInfo() {
		setTitle("��List���ϴ���ѧ����Ϣ by susmote");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane,BorderLayout.CENTER);
		scrollPane.setViewportView(getTable());
	}
	private JTable getTable() {
        if (table == null) {
            table = new JTable();// �������ؼ�
            table.setRowHeight(23);// �����и߶�
            String[] columns = { "����", "�Ա�", "��������" };// ������������
            // �������ģ��
            DefaultTableModel model = new DefaultTableModel(columns, 0);
            table.setModel(model);// ���ñ��ģ��
            List<String> students = getStudents();// ���÷�������list���϶���
            for (String info : students) {// ����ѧ�����϶���
                String[] args = info.split(",");// ��ѧ����Ϣ���Ϊ����
                model.addRow(args);// ��ѧ����Ϣ��ӵ�������
            }
        }
        return table;
    }

	private List<String> getStudents() {
        // ����List���϶���
        List<String> list = new ArrayList<String>();
        list.add("���,��,1981-1-1");// ������ݵ����϶���
        list.add("С��,Ů,1981-1-1");
        list.add("С��,��,1981-1-1");
        list.add("С��,��,1981-1-1");
        list.add("С��,��,1981-1-1");
        list.add("С��,��,1981-1-1");
        return list;
    }

}
