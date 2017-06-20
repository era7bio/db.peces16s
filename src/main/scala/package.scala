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
