package bobo4.flowgraph.gui;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.jgrapht.alg.shortestpath.AllDirectedPaths;

public class FileChooser {

	public static String DirectoryPath;
	
	public FileChooser() {
		// TODO Auto-generated constructor stub
		JFileChooser file = new JFileChooser();
		String str = null;
		file.setMultiSelectionEnabled(true);
		file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		file.setFileHidingEnabled(false);
		if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			java.io.File f = file.getSelectedFile();
			str = f.getPath();
		}
		FileChooser.DirectoryPath = str;

		if (FileChooser.DirectoryPath == null) {
			JOptionPane.showMessageDialog(null, "You need choose one file", "Warning", JOptionPane.WARNING_MESSAGE);
			
		}
	}	
}
