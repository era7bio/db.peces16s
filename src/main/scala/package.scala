package ohnosequences.db

import ohnosequences.awstools.s3._

package object peces16s {

  val dbName = "ohnosequences.db.peces16s"

  private val metadata = generated.metadata.peces16s

  val s3prefix: S3Folder =
    s3"resources.ohnosequences.com" /
    metadata.organization /
    metadata.artifact /
    metadata.version /
}
