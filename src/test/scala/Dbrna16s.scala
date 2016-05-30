package era7bio.db.test

import era7bio.db._
import org.scalatest.FunSuite
import better.files._


class Dbrna16sTest extends FunSuite {

  // NOTE where are these files?
  ignore("Process some sample files") {

    rna16s.generate.processSources(
      file"source.table.sample.tsv",
      file"output.table.sample.tsv".clear(),
      file"discarded.table.sample.tsv".clear()
    )(file"source.sample.fasta",
      file"output.sample.fasta".clear(),
      file"discarded.sample.fasta".clear()
    )
  }
}
