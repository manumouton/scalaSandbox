package programmingScala.principles

import java.io.File

/**
  * Created by mou on 07/06/2017.
  */
class FilesUtils {
  def moveTemporaryFile(file: TemporaryFile, destFile: File):Boolean ={
    file.moveTo(destFile).isFile
  }
}

object FilesUtils {
  def main(args: Array[String]): Unit = {

  }
}