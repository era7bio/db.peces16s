
```scala
package era7bio.db

import ohnosequences.awstools.s3._

package object db16s18s {

  val dbName = "era7bio.db.16s18s"

  private val metadata = generated.metadata.db16s18s

  val s3prefix: S3Folder =
    s3"resources.ohnosequences.com" /
    metadata.organization /
    metadata.artifact /
    metadata.version /
}

```




[test/scala/dropRedundantAssignments.scala]: ../../test/scala/dropRedundantAssignments.scala.md
[test/scala/runBundles.scala]: ../../test/scala/runBundles.scala.md
[test/scala/mg7pipeline.scala]: ../../test/scala/mg7pipeline.scala.md
[test/scala/package.scala]: ../../test/scala/package.scala.md
[test/scala/compats.scala]: ../../test/scala/compats.scala.md
[test/scala/clusterSequences.scala]: ../../test/scala/clusterSequences.scala.md
[test/scala/dropInconsistentAssignments.scala]: ../../test/scala/dropInconsistentAssignments.scala.md
[test/scala/pick16SCandidates.scala]: ../../test/scala/pick16SCandidates.scala.md
[test/scala/releaseData.scala]: ../../test/scala/releaseData.scala.md
[main/scala/package.scala]: package.scala.md
[main/scala/data.scala]: data.scala.md
